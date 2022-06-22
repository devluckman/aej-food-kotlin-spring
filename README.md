# Food API

## Base url

```
https://food-aej.herokuapp.com
```

## Table endpoints
### Food

| Name             | Endpoint                                      | Method   | Bearer token | Body and response                   |
|------------------|-----------------------------------------------|----------|--------------|-------------------------------------|
| Get foods        | `/v1/food`                                    | `GET`    | no           | [example](#food---get-foods)        |
| Get food by Id   | `/v1/food:id`                                 | `GET`    | no           | [example](#food---get-food-by-id)   |
| Add food to list | `/v1/food?name="{name_food}"`                 | `POST`   | no           | [example](#food---add-food-to-list) |
| Delete food      | `/v1/food/delete/:id`                         | `DELETE` | no           | [example](#food---delete-food)      |
| Update food      | `/v1/food/update?name="{name_food}"&id"{id}"` | `PUT`    | no           | [example](#food---update-food)      |

## Run on localhost
- Run `./gradlew bootRun`

---

### Food - Get foods

```
GET /v1/food
```

Response

```json
{
  "status": true,
  "message": "Success",
  "data": [
    {
      "id": "37f7be08-97a1-4ddd-945e-7088aabfe25c",
      "name": "Kupat Tahu"
    },
    {
      "id": "b64c142a-2711-4dc2-a30f-d657778d542c",
      "name": "Bubur Kacang"
    },
    {
      "id": "7f30549c-d092-487d-9a25-5194bb73d265",
      "name": "Pempek Palembang"
    }
  ]
}
```

### Food - Get Food by Id

```
GET /v1/food?id=37f7be08-97a1-4ddd-945e-7088aabfe25c
```

Response

```json
{
  "status": true,
  "message": "Success",
  "data": {
    "id": "37f7be08-97a1-4ddd-945e-7088aabfe25c",
    "name": "Kupat Tahu"
  }
}
```

### Food - Add food to list

```
POST /v1/food?name="Cuankie"
```

Response

```json
{
  "status": true,
  "message": "Success Add Movie",
  "data": [
    {
      "id": "37f7be08-97a1-4ddd-945e-7088aabfe25c",
      "name": "Kupat Tahu"
    },
    {
      "id": "b64c142a-2711-4dc2-a30f-d657778d542c",
      "name": "Bubur Kacang"
    },
    {
      "id": "7f30549c-d092-487d-9a25-5194bb73d265",
      "name": "Pempek Palembang"
    },
    {
      "id": "5f5ace70-735f-40ba-a421-828d4f562818",
      "name": "Cuankie"
    }
  ]
}
```

### Food - Delete food

```
DELETE /v1/food/delete/5f5ace70-735f-40ba-a421-828d4f562818 
```

Response

```json
{
  "status": true,
  "message": "Success Delete Food",
  "data": [
    {
      "id": "37f7be08-97a1-4ddd-945e-7088aabfe25c",
      "name": "Kupat Tahu"
    },
    {
      "id": "b64c142a-2711-4dc2-a30f-d657778d542c",
      "name": "Bubur Kacang"
    },
    {
      "id": "7f30549c-d092-487d-9a25-5194bb73d265",
      "name": "Pempek Palembang"
    }
  ]
}
```

### Food - Update food

```
PUT /v1/food/update?name="Kupat Tahu Petis"&id="37f7be08-97a1-4ddd-945e-7088aabfe25c"
```

Response

```json
{
  "status": true,
  "message": "Success Update Food",
  "data": [
    {
      "id": "37f7be08-97a1-4ddd-945e-7088aabfe25c",
      "name": "Kupat Tahu Petis"
    },
    {
      "id": "b64c142a-2711-4dc2-a30f-d657778d542c",
      "name": "Bubur Kacang"
    },
    {
      "id": "7f30549c-d092-487d-9a25-5194bb73d265",
      "name": "Pempek Palembang"
    }
  ]
}
```