-- Inner Join
-- Mostrar los usuarios que tengan compras

SELECT 
	u.user_id,
    u.email,
    p.purchase_id,
    p.purchase_date
    FROM users u
    INNER JOIN purchases p
    ON u.user_id = p.fk_user_id;
    
-- Mostrar usuarios, purchasesc purchase_has_products y products
SELECT 
	u.user_id,
    u.email,
    p.purchase_id,
    p.purchase_date,   
    php.quantity,
    php.purchase_sold,
	php.product_id,
    pro.name
    FROM users u
    INNER JOIN purchases p
    ON u.user_id = p.fk_user_id
	INNER JOIN purchase_has_products php
    ON p.purchase_id = php.purchase_id
    INNER JOIN products pro
    ON php.product_id = pro.product_id
    ORDER BY p.purchase_id;
    
    
    
 SELECT count(*) FROM users;   
 SELECT * FROM purchases;