USE `shoppingCart`;
DROP procedure IF EXISTS `getShoppingCart`;

DELIMITER $$
USE `shoppingCart`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `getShoppingCart`(IN OUT_shoppingCartId VARCHAR(25), OUT OUT_code INTEGER, OUT OUT_message VARCHAR(150))
BEGIN
	DECLARE conShoppingCart VARCHAR(2);
    DECLARE `_rollback` BOOL DEFAULT 0;
    DECLARE CONTINUE HANDLER FOR SQLEXCEPTION SET `_rollback` = 1;
    START TRANSACTION;
    SELECT COUNT(id) INTO conShoppingCart FROM shoppingCart WHERE id = OUT_shoppingCartId;
    
    IF conShoppingCart > 0 THEN
		SELECT customer.id customerId, customer.name customerName, productOffering.id poId, productOffering.name poName, productOffering.description poDescription, productOffering.priceType poPriceType, productOffering.unitOfMeasure poUnitOfMeasure, productOffering.value poValue, productOffering.urlImage poUrlImage, shoppingCart.id, shoppingCart.ItemId itemId, shoppingCart.quantity FROM customer, productOffering, shoppingCart  WHERE shoppingCart.id = OUT_shoppingCartId AND shoppingCart.proOffId = productOffering.id AND shoppingCart.customerId = customer.id ORDER BY shoppingCart.id;
		SET OUT_code = 0;
		SET OUT_message = 'success';
    ELSE
		SET OUT_code = -1;
		SET OUT_message = 'El cliente no tiene un carrito registrado';
        
    END IF;
    
    IF `_rollback` THEN
        ROLLBACK;
		SET OUT_code = -1;
		SET OUT_message = 'fault';
    ELSE
        COMMIT;
    END IF;
END$$

DELIMITER ;

