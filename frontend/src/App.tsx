import {useEffect, useState} from 'react'
import './App.css'
import { UserDTO, User } from './User';

function App() {
    const [users, setUsers] = useState<UserDTO[]>([]);
    useEffect(() => {
        fetch(`http://localhost:8080/users`)
            .then(response => response.json() as Promise<UserDTO[]>)
            .then(data => setUsers(data));
    }, []);
  return (
    <>
        {users.map(user => <User key={user.id} user={user} />)}
    </>
  )
}

export default App
