
-- Deshabilitar restricciones
SET FOREIGN_KEY_CHECKS = 0;

-- Activar el autoincrement en id
ALTER TABLE products MODIFY COLUMN product_id BIGINT AUTO_INCREMENT;

-- Habilitar restricciones
SET FOREIGN_KEY_CHECKS = 1;
