# Transaction Service

## Endpoints

### Save Transaction:
````
POST /api/transaction HTTP/1.1
Host: localhost:9030
Authorization: Basic basic64(username:password)
Content-Type: application/json
Content-Length: 40

{
    "userId":1,
    "productId":1
}
````

### Get Transactions:
````
GET /api/transaction/1 HTTP/1.1
Host: localhost:9030
Authorization: Basic basic64(username:password)
Content-Type: application/json
Content-Length: 40

{
    "userId":1,
    "productId":1
}
````

### Delete Transaction:
````
DELETE /api/transaction/1 HTTP/1.1
Host: localhost:9030
Authorization: Basic basic64(username:password)
Content-Type: application/json
Content-Length: 40

{
    "userId":1,
    "productId":1
}
````