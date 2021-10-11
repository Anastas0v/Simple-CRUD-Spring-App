#GET
http://localhost:8080/rest/books
#GET BY ID
http://localhost:8080/rest/books/100
#POST
http://localhost:8080/rest/books
#PUT
http://localhost:8080/rest/books
#DELETE BY ID
http://localhost:8080/rest/books/100

=============================================================
#Requests
{
  "id": 100,
  "title": "First Book",
  "author": "Book Author",
  "coverPhotoURL": "URL",
  "isbnNumber": 1234445555845,
  "price": 2776,
  "language": "English"
}