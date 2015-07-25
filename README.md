# This is Spring_DATA_JPA quick start.

### Environment
- java             1.8.
- h2 database      1.4.186
- lombok           1.16.2
- spring-boot      1.2.4.RELEASE
- spring-data-jps  1.7.2.RELEASE


### How to work this program

  1. H2 database start. You should read a property file.
  2. Run this application server


### API

    [Post] /student
    [Param]
        {
          "name" : "Hong gil dong",
          "major" : "Computer Science"
        }
    [Result]
        { "id" : 1 }


    [GET] /student/{studentId}
    [Result]
        {
          "student": {
              "id": 1,
              "name": "Hong gil dong",
              "major": "Computer Science"
          }
        }


    [PUT] /student/{studentId}
    [Param]
        {
          "name" : "Hong gil dong",
          "major" : "Computer Engineering"
        }
    [Result]
        success


    [DELETE] /student/{studentId}
    [Result]
        success
