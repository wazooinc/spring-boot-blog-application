ALTER TABLE post ADD COLUMN image_file_path VARCHAR(255) AFTER body;

-- backfill our sample posts in the db with updated column value
UPDATE post SET image_file_path='pexels-adrien-olichon-16059681.jpg' WHERE id=1;
UPDATE post SET image_file_path='pexels-adrien-olichon-16059681.jpg' WHERE id=2;
