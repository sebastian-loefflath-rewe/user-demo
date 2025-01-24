import {useEffect, useState} from 'react'
import './App.css'
import { UserDTO, User } from './User';

function App() {
    const [user, setUser] = useState<UserDTO | undefined>(undefined);
    useEffect(() => {
        fetch('http://localhost:8080/users/85337937-20A9-4DA9-ADB1-74EFECBDF04F')
            .then(response => response.json() as Promise<UserDTO>)
            .then(data => setUser(data));
    }, []);
  return (
    <>
        {user && <User user={user} />}
    </>
  )
}

export default App
