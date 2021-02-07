USE `shoppingCart`;
DROP procedure IF EXISTS `createShoppingCart`;

DELIMITER $$
USE `shoppingCart`$$
CREATE PROCEDURE `createShoppingCart`(IN IN_quantity Integer, IN IN_proOffId VARCHAR(25), IN IN_customerId VARCHAR(25), OUT OUT_shoppingCartId VARCHAR(25),
										OUT OUT_code INTEGER, OUT OUT_message VARCHAR(150))
BEGIN
	DECLARE varShoppingCart VARCHAR(25);
    DECLARE countCustomer INTEGER;
    
    DECLARE `_rollback` BOOL DEFAULT 0;
    DECLARE CONTINUE HANDLER FOR SQLEXCEPTION SET `_rollback` = 1;
    START TRANSACTION;
    SELECT COUNT(id) INTO countCustomer FROM shoppingCart WHERE customerId = IN_customerId;
    IF countCustomer = 0 THEN
		SELECT CONCAT('ERPSHOCAR', (COUNT(distinct id) + 1)) INTO varShoppingCart FROM shoppingCart;
		INSERT INTO shoppingCart (id, ItemId, quantity, proOffId, customerId) VALUE (varShoppingCart, 'ERPITEMSHOCAR1', IN_quantity, IN_proOffId, IN_customerId);
    
		SET OUT_code = 0;
		SET OUT_message = 'success';
		SET OUT_shoppingCartId = varShoppingCart;
	ELSE
		SET OUT_code = -1;
		SET OUT_message = 'El cliente ya tiene un carrito registrado';
        
		SET OUT_shoppingCartId = varShoppingCart;
    END IF;
    
    IF `_rollback` THEN
        ROLLBACK;
        SET OUT_shoppingCartId = -1;
		SET OUT_code = -1;
		SET OUT_message = 'fault';
    ELSE
        COMMIT;
    END IF;
END$$

DELIMITER ;
