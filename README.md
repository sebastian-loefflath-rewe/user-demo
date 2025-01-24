# user-demo

## Development

Run Frontend Dev Server:

```
cd frontend
npm install
npm run dev
```

Run Backend Dev Server:

```
cd backend
./gradlew bootRun
```

## Task

If you encounter any problems, please reach out to us. We are happy to help. And please do not spend to much time on this.

We have a small application that currently just returns a list of users from the database and displays them.
Your task is to extend the application.

We do not expect tests on the frontend, but we expect tests on the backend.

Error Handling: please show the validation errors directly on the input elements. For other errors please display a small
info box at the top of the page.

We used Kotlin for the backend code, please feel free to use java if you are more comfortable with it.

Requirements:

- [ ] Delete Users: add a button to the user list that allows to delete the corresponding user. The button should
      send a request and pass the user ID to the backend. The backend should delete the user from the database.
      On success the frontend should remove the user from the list.
- [ ] Add Users: add a button to the user list that allows to add a new user. The button could open a new page, a modal
      or an inline editing component (your choice), that displays a form to enter the user's email and their
      date of birth. The email is required the date of birth can be left empty.
    - Validation:
      - Please validate on the frontend that the email is valid (any appropriate definition of valid is fine e.g. 'contains @')
      - If a date of birth is given, the user should be at least 18 years old.
      - Also implement appropriate backend validation.
    - Add a button to save the **valid** user, which triggers a POST request to the backend to save the user to the database.
      The button should be disabled if the form is not valid.
      On success the frontend should add the user to the list.
    - Ensure that the email is unique.
- [ ] Update User: add a button to each user that allows updating the email and date of birth. Please reuse the form
      from the "Add Users" task. The button should open the form prefilled with the user's data. The form should have a
      "Save" button that triggers a PUT request to the backend to update the user in the database.

### Questions

Here are some questions to your solution. Please write a short answer to each of them, **we do not expect code for these**.
If you see multiple solutions please provide a short list of pros and cons for each of them.

- Imagine two operators are editing the same user resource at the same time. What could happen and how could you prevent this?
- Imagine we have one million users in the list. What steps could you take to ensure the frontend stays responsive?
     