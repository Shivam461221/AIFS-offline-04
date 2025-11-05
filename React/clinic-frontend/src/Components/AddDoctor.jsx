import axios from "axios";
import { useContext, useState } from "react"
import { UserContext } from "../Context/UserContext";
import { toast, ToastContainer } from "react-toastify";

export default function AddDoctor() {
    const { token } = useContext(UserContext);
    console.log(token);
    const [formData, setFormData] = useState({
        firstName: "",
        lastName: "",
        phoneNumber: "",
        email: "",
        gender: "",
        password: ""
    });

    console.log(formData);

    const handleChange = (e) => {
        setFormData(prev => ({ ...prev, [e.target.name]: e.target.value }));
    }

    const config = {
        headers: {
            'Authorization': `Bearer ${token}`,
            'Content-Type': 'application/json'
        }
    }

    const addDoctor = async (e) => {
        e.preventDefault();
        console.log(formData);
        console.log(config);
        try {
            let resposne = await axios.post('http://localhost:8000/api/doctors/register', formData, config)

            if (resposne.status === 201) {
                toast.success('Doctor added')
                
                setFormData({
                    firstName: "",
                    lastName: "",
                    phoneNumber: "",
                    email: "",
                    gender: "",
                    password: ""
                });
            }
        }
        catch (error) {
            toast.error('Not added');
            console.log(error.message);
             setFormData({
                    firstName: "",
                    lastName: "",
                    phoneNumber: "",
                    email: "",
                    gender: "",
                    password: ""
                });
        }
    }

    return <>
        <ToastContainer />
        <section className="book_section layout_padding">
            <div className="container">
                <div className="row">
                    <div className="col">
                        <form>
                            <h4>
                                ADD <span>DOCTOR</span>
                            </h4>
                            <div className="form-row ">
                                <div className="form-group col-lg-4">
                                    <label >First Name </label>
                                    <input value={formData.firstName} onChange={handleChange} name="firstName" type="text" className="form-control" />
                                </div>
                                <div className="form-group col-lg-4">
                                    <label >Last Name </label>
                                    <input value={formData.lastName} onChange={handleChange} name="lastName" type="text" className="form-control" id="inputPatientName" />
                                </div>
                                <div className="form-group col-lg-4">
                                    <label >Phone Number </label>
                                    <input value={formData.phoneNumber} onChange={handleChange} name="phoneNumber" type="text" className="form-control" id="inputPatientName" />
                                </div>
                            </div>
                            <div className="form-row ">
                                <div className="form-group col-lg-4">
                                    <label >Email</label>
                                    <input value={formData.email} onChange={handleChange} name="email" type="email" className="form-control" id="inputPatientName" />
                                </div>
                                <div className="form-group col-lg-4">
                                    <label >Gender </label>
                                    <input value={formData.gender} onChange={handleChange} name="gender" type="text" className="form-control" id="inputPatientName" />
                                </div>
                                <div className="form-group col-lg-4">
                                    <label >Password </label>
                                    <input value={formData.password} onChange={handleChange} name="password" type="password" className="form-control" id="inputPatientName" />
                                </div>
                            </div>
                            <div className="btn-box">
                                <button onClick={addDoctor} type="submit" className="btn ">Add</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </section>
    </>
}