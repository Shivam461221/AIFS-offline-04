import axios from "axios";
import { useContext, useEffect } from "react";
import { useState } from "react"
import { UserContext } from "../Context/UserContext";
import { ToastContainer, toast } from "react-toastify";

export default function DoctorsList(){
    const [doctors, setDoctors] = useState([]);
    const {token} = useContext(UserContext);

    const config = {
        headers: {
            'Authorization': `Bearer ${token}`,
            'Content-Type': 'application/json'
        }
    }

    const getDoctors = async()=>{
        try{
            let response = await axios.get('http://localhost:8000/api/doctors/getAll', config);

            if(response){
                setDoctors(response.data);
                           }
        }
        catch(error){
            console.log(error);
        }
    }

    useEffect(()=>{
        getDoctors();
    }, [])

    const deleteDoctor= async(id)=>{
        try{
            let response = await axios.delete(`http://localhost:8000/api/doctors/delete/${id}`, config);

            if(response.status==200){
                toast.success('Deleted')
                 let index = doctors.findIndex(doctor=>doctor._id===id);
                doctors.splice(index, 1);
                setDoctors([...doctors]);
            }
        }
        catch(error){
            toast.error('Not deleted');
            console.log(error);
        }
    }

    return <>
        <ToastContainer/>
        <table className="table">
            <thead>
                <tr>
                    <th>S.no</th>
                    <th>Id</th>
                    <th>Name</th>
                    <th>Email</th>
                    <th>Role</th>
                    <th>Actions</th>
                </tr>
            </thead>
            <tbody>
                {
                    doctors.map((doctor, index)=><tr key={index}>
                        <td>{index+1}</td>
                        <td>{doctor._id}</td>
                        <td>{doctor.firstName+" "+doctor.lastName}</td>
                        <td>{doctor.email}</td>
                        <td>{doctor.role}</td>
                        <td><button onClick={()=>deleteDoctor(doctor._id)} className="btn btn-danger">Delete</button></td>
                    </tr>)
                }
            </tbody>
        </table>
    </>
}