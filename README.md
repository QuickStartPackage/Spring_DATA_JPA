This is Spring_DATA_JPA quick start.

How to work this program ?

  1. H2 database start.
     You should read a property file(application.yml) !!!
  2. Run this Application Server


API
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

