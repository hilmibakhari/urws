### Project Plan

This service implements simple social media application.

Entities:
- Users
- Posts

Relationship:

Users -|--< posts

Services:
- Retrieve all users: GET /users
- Retrieve user with user_id: GET /users/{user_id}
- Create a user: POST /users
- Remove user with user_id: DELETE /users/{user_id}
- Retrieve all posts for a user: GET /users/{user_id}/posts
- Create a posts for a user: POST /users/{user_id}/posts
- Retrieve a specific post by user: GET /users/{user_id}/posts/{post_id}
