USE `shoppingCart`;
DROP procedure IF EXISTS `listProductOffering`;

DELIMITER $$
USE `shoppingCart`$$
CREATE PROCEDURE `listProductOffering` (OUT OUT_code INTEGER, OUT OUT_message VARCHAR(150))
BEGIN
	DECLARE conPO VARCHAR(5);
	DECLARE `_rollback` BOOL DEFAULT 0;
    DECLARE CONTINUE HANDLER FOR SQLEXCEPTION SET `_rollback` = 1;
    START TRANSACTION;
    SELECT COUNT(id) INTO conPO FROM productOffering;
	IF conPO > 0 THEN
		SELECT productOffering.id poId, productOffering.name poName, productOffering.description poDescription, productOffering.priceType poPriceType, productOffering.unitOfMeasure poUnitOfMeasure, productOffering.value poValue, productOffering.urlImage poUrlImage FROM productOffering;
		SET OUT_code = 0;
		SET OUT_message = 'success';
    ELSE
		SET OUT_code = -1;
		SET OUT_message = 'No existen productos registrados';
        
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

