CREATE table organization(id serial PRIMARY KEY, name VARCHAR(250), url VARCHAR(150), logo_link VARCHAR(150), type VARCHAR(150));
CREATE index idx_organization_id on organization(id);
CREATE table app_user(id serial PRIMARY KEY, first_name VARCHAR(150), last_name VARCHAR(150),
email VARCHAR(150) NOT NULL, password VARCHAR(150) NOT NULL, role VARCHAR(100), 
has_changed_password SMALLINT, organization_id INTEGER, CONSTRAINT app_user_organization_id_fkey FOREIGN KEY (organization_id)
REFERENCES organization (id) MATCH SIMPLE ON UPDATE NO ACTION ON DELETE CASCADE);
CREATE index idx_user_id on app_user(id);

