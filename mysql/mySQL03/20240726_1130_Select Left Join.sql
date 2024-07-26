
-- Left Join
SELECT 
	* 
    FROM users u
    LEFT JOIN purchases p
    ON u.user_id = p.fk_user_id;
    
-- Right Join
SELECT 
	*
    FROM categories
    RIGHT JOIN products
    ON products.fk_category_id = categories.category_id;
