

| Method                         | Description                                                                                                      |
| ------------------------------ | ---------------------------------------------------------------------------------------------------------------- |
| GET `/products/:id`            | Devuelve un producto `{ "id" : 5, "name": "secador de pelo", "price": "89.99" }                                  |
| POST `/pokemon`                | recibe un pokemon `{ "tipo" : "electrico", "nombre": "Pikachu" } y devuelve un string diciendo "Pokemon creado!" |
| PUT `/microfono?muted=true`    | Si muted == true devuelve un String "muteada" y si no "desmuteada". El parametro muted es obligatorio            |
| DELETE `/unicornio?q=100&p=80` | Devuelve el String "Eliminados 100 unicornios por un total de 8000 euros                                         |
