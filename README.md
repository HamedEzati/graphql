# graphql
## add api
curl --location --request POST 'localhost:7777/graphql' \
--header 'Content-Type: application/json' \
--data-raw '{"query":"mutation{\n   writePost(postInputModel: {\n       title:\"title-test\",\n       text:\"text-test\",\n       category:\"category-test\"\n   }){\n       id,\n       title\n   } \n}\n","variables":{}}'
