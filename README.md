***NOTICE FOR WSL***
Please restart mySQL server upon entering WSL (If it is not started or in an error state).
```
sudo service mysql restart
```
1. Please create a mysql db.
```
mysql -uroot -e "create database if not exists doctor_match;"
```
(For testing purposes, you can manually drop tables with the format...)
```
mysql -uroot doctor_match;
#Then,
drop table doctors;
drop table patients;
drop table doctors_avail;
drop table patients_avail;
drop table appointments;
```
(These tables are automatically generated when Java/Spring server starts, as long as the database exists.)

(For testing purposes, you may insert a db seed by using the sql cmds in ./client/src/static-dev/INSERT.sql)
```
-- Start java-spring server build with gradle before exectuing below code. It will create the new
-- Tables for you.

INSERT INTO doctors (id,f_name,l_name,email,payments,conditions,adddress)
VALUES
(1, "Bob", "Smith, "bobsmith@aim.com", "Medicaid", "cancer", "1 California Way, Californa City, CA 82182"),
(2, "James", "Smith, "bobsmith@aim.com", "Medicaid", "cancer", "1 California Way, Californa City, CA 82182"),
(3, "Lola", "Smith, "bobsmith@aim.com", "Medicaid", "cancer", "1 California Way, Californa City, CA 82182"),
;

INSERT INTO cars (vin,year,make,model,miles,price,photo_url,location_id)
VALUES
("ASD12333444",2016,"Chevrolet","Cruze Hatch",23555,20500,"https://i.pinimg.com/originals/c9/a3/37/c9a337e72985088c0f6dfae49fc2b737.jpg",1),
("ASD12333555",2019,"Chevrolet","Cruze SS",2,39999,"https://o.aolcdn.com/images/dims3/GLOB/crop/1707x962+0+0/resize/800x450!/format/jpg/quality/85/https://s.yimg.com/os/creatr-uploaded-images/2018-11/5e3fc200-e430-11e8-bebe-208bd43506e7",1),
("ASD12333444",2014,"Vauxhall","VXR8 GTS",40599,18900,"https://cdn.motor1.com/images/mgl/lOYbJ/s1/vauxhall-vxr8-gts-is-the-chevy-ss-insane-supercharged-cousin.jpg",1),
("ASD12333444",2014,"Chevrolet","SS",90965,21990,"https://i136.photobucket.com/albums/q176/HazmanAvatarKing/Cameros/Cararo_2011/Christiancoach-6.jpg",1)
;

```
2. Please start the Java/Spring api with gradle build. To do this from the root dir, it is 
```
./gradlew bootRun

```

3. Please download all dependencies for npm.
```
cd ./client;
npm install; npm start;
```

4. Please execute the client npm script. **Using a separate terminal or thread**
```
#cd ./client;
npm start
```
### `npm run build`

Builds the app for production to the `build` folder.<br>
It correctly bundles React in production mode and optimizes the build for the best performance.
Your app is ready to be deployed!

# Doctor MAtch Tool

## Summary


### Index

- [Home](/README.md)
- [Cars Overview](/cars_overview.md)

### Client Component Tree


### Main Features

- Base Goals

  - Show all locations
