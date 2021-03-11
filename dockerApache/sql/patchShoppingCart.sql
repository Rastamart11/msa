USE `shoppingcart`;
DROP procedure IF EXISTS `patchShoppingCart`;

DELIMITER $$
USE `shoppingcart`$$
CREATE PROCEDURE `patchShoppingCart`(IN IN_id VARCHAR(25), IN IN_action VARCHAR(25), IN IN_quantity Integer, IN IN_proOffId VARCHAR(25),
									IN IN_customerId VARCHAR(25), OUT OUT_shoppingCartId VARCHAR(25), OUT OUT_code INTEGER, OUT OUT_message VARCHAR(150))
BEGIN
	DECLARE varShoppingCartItem VARCHAR(25);
    DECLARE countItem INTEGER;
    DECLARE countPO INTEGER;
    DECLARE item VARCHAR(25);
    DECLARE subItem INTEGER;
    
    SELECT COUNT(ItemId) INTO countItem FROM shoppingCart WHERE id = IN_id;
    IF countItem > 0 THEN
		IF IN_action = 'add' OR IN_action = 'ADD' THEN
			SET varShoppingCartItem = 	CONCAT('ERPSHOCARITEM', (countItem+1));
			INSERT INTO shoppingCart (id, ItemId, quantity, proOffId, customerId) VALUE (IN_id, varShoppingCartItem, IN_quantity, IN_proOffId, IN_customerId);
			SET OUT_code = 0;
			SET OUT_message = 'Se agrego correctamente';
			SET OUT_shoppingCartId = IN_id;
		ELSEIF IN_action = 'update' OR IN_action = 'UPDATE' THEN
			SELECT quantity INTO countPO FROM shoppingCart WHERE id = IN_id AND proOffId = IN_proOffId AND customerId = IN_customerId;
            UPDATE shoppingCart SET quantity = (countPO + IN_quantity) WHERE id = IN_id AND proOffId = IN_proOffId AND customerId = IN_customerId;
			SET OUT_code = 0;
			SET OUT_message = 'Se actualizo correctamente';
			SET OUT_shoppingCartId = IN_id;
		ELSEIF IN_action = 'delete' OR IN_action = 'DELETE' THEN
			SELECT ItemId INTO item FROM shoppingCart WHERE id = IN_id AND proOffId = IN_proOffId AND customerId = IN_customerId;
            SET subItem = SUBSTRING(item, 14);
			SET SQL_SAFE_UPDATES=0;
			DELETE FROM shoppingCart WHERE id = IN_id AND proOffId = IN_proOffId AND customerId = IN_customerId;
			SET SQL_SAFE_UPDATES=1;
            loop_label: LOOP
				IF subItem > (countItem - 1) THEN
					LEAVE loop_label;
				END IF;
				UPDATE shoppingCart SET ItemId = CONCAT('ERPSHOCARITEM', (subItem)) WHERE id = IN_id AND ItemId = CONCAT('ERPSHOCARITEM', (subItem + 1));
				SET subItem = subItem + 1;
				ITERATE loop_label;
			END LOOP;
			SET OUT_code = 0;
			SET OUT_message = 'Se elimino correctamente';
			SET OUT_shoppingCartId = IN_id;
		ELSE 
			SET OUT_code = -1;
			SET OUT_message = 'La accion no se reconoce';
			SET OUT_shoppingCartId = '-1';
        END IF;
	ELSE 
		SET OUT_code = -1;
		SET OUT_message = 'El cliente no tiene un carrito registrado';
		SET OUT_shoppingCartId = '-1';
    END IF;
END$$

DELIMITER ;

