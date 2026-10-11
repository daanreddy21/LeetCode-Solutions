SELECT u.name,
       IFNULL(SUM(d.distance), 0) AS travelled_distance
FROM users u
LEFT JOIN Rides d
    ON u.id = d.user_id
GROUP BY u.id, u.name
ORDER BY travelled_distance DESC, u.name asc;