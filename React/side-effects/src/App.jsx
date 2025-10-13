import { useEffect, useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import 'bootstrap/dist/css/bootstrap.min.css';

function App() {
  const [count, setCount] = useState(0)
  const [users, setUsers] = useState([]);

  const getUsers = async () => {
    try {
      let response = await fetch('https://dummyjson.com/users');
      let data = await response.json();
      setUsers(data.users);
      console.log(data.users);
    }
    catch (error) {

    }
  }

  useEffect(() => {
    //first render
    console.log('Runs on first render')
    getUsers();
  }, []);

  useEffect(() => {
    //runs on every render
    console.log('Runs on every render')
  });

  useEffect(() => {
    //renders when dependency updates
    console.log('Runs on dependency updates');
    alert('User updated');
  }, [users]);

  const removeUser=(id)=>{
    let index = users.findIndex(user=>user.id===id);
    users.splice(index, 1);
    setUsers([...users]);
  }

  return (
    <>
      <div className="container-fluid p-3 bg-danger display-6 text-center text-white">
        Users
      </div>
      <table className='table'>
        <thead>
          <tr>
            <th>S.no</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Age</th>
            <th>Gender</th>
            <th>Action</th>
          </tr>
        </thead>
        <tbody>
          {
            users.map((user, index)=><tr key={index} >
              <td>{index+1}</td>
              <td>{user.firstName}</td>
              <td>{user.lastName}</td>
              <td>{user.age}</td>
              <td>{user.gender}</td>
              <td><button onClick={()=>removeUser(user.id)} className='btn btn-outline-danger'>Remove</button></td>
            </tr>)
          }
        </tbody>
      </table>

    </>
  )
}

export default App
