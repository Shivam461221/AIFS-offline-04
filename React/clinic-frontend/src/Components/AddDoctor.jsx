import axios from "axios";
import { useContext, useState } from "react"
import { UserContext } from "../Context/UserContext";

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
                alert('Doctor added')
            }
        }
        catch (error) {
            alert('Not added');
            console.log(error.message);
        }
    }

    return <>
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
                                    <input onChange={handleChange} name="firstName" type="text" className="form-control" />
                                </div>
                                <div className="form-group col-lg-4">
                                    <label >Last Name </label>
                                    <input onChange={handleChange} name="lastName" type="text" className="form-control" id="inputPatientName" />
                                </div>
                                <div className="form-group col-lg-4">
                                    <label >Phone Number </label>
                                    <input onChange={handleChange} name="phoneNumber" type="text" className="form-control" id="inputPatientName" />
                                </div>
                            </div>
                            <div className="form-row ">
                                <div className="form-group col-lg-4">
                                    <label >Email</label>
                                    <input onChange={handleChange} name="email" type="email" className="form-control" id="inputPatientName" />
                                </div>
                                <div className="form-group col-lg-4">
                                    <label >Gender </label>
                                    <input onChange={handleChange} name="gender" type="text" className="form-control" id="inputPatientName" />
                                </div>
                                <div className="form-group col-lg-4">
                                    <label >Password </label>
                                    <input onChange={handleChange} name="password" type="password" className="form-control" id="inputPatientName" />
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