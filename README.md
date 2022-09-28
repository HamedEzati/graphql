# spring boot + graphql + mongodb
This project is a sample of working spring boot, graphql and mongodb all together.
### add api
curl --location --request POST 'localhost:7777/graphql' \
--header 'Content-Type: application/json' \
--data-raw '{"query":"mutation{\n   writePost(postInputModel: {\n       title:\"title-test\",\n       text:\"text-test\",\n       category:\"category-test\"\n   }){\n       id,\n       title\n   } \n}\n","variables":{}}'
### get list api
curl --location --request POST 'localhost:7777/graphql' \
--header 'Content-Type: application/json' \
--data-raw '{"query":"query{\n   recentPosts(count: 10, offset: 0){\n       id,\n       title,\n       author{\n           id\n       }\n   }\n}","variables":{}}'
### get api
curl --location --request POST 'localhost:7777/graphql' \
--header 'Content-Type: application/json' \
--data-raw '{"query":"query{\n   getPostById(postId: \"6334466823054a30cda15cd3\"){\n       id,\n       title\n   } \n}","variables":{}}'
