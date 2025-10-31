import axios from "axios"
import { useContext, useState } from "react";
import { useNavigate } from "react-router-dom";
import { UserContext } from "../Context/UserContext";

export default function Login() {
    const navigate = useNavigate();
    const [email, setEmail] = useState('');
    const [password, setPassword] = useState('');
    const { setToken, setUser, setIsLoggedIn } = useContext(UserContext);

    // const [formData, setFormData] = useState({
    //     email:"",
    //     password:""
    // });

    const login = async (e) => {
        e.preventDefault();
        try {
            let response = await axios.post('http://localhost:8000/api/auth/login', { email, password });
            console.log(response);
            if (response.data.token) {
                setUser(response.data.user);
                setToken(response.data.token);
                setIsLoggedIn(true);
                navigate("/dashboard")
            }

        }
        catch (error) {
            alert('Something went wrong')
            console.log(error);
            navigate('/login');
        }
    }

    return <>
        <section className="book_section layout_padding">
            <div className="container">
                <div className="row">
                    <div className="col">
                        <form>
                            <h4>
                                LOG <span>IN</span>
                            </h4>
                            <div className="form-row ">
                                <div className="form-group col-lg-6">
                                    <label for="iUsername">Username</label>
                                    <input onChange={(e) => setEmail(e.target.value)} type="text" className="form-control" id="email" placeholder="" />
                                </div>
                                <div className="form-group col-lg-6">
                                    <label for="Password">Password</label>
                                    <input onChange={(e) => setPassword(e.target.value)} type="password" className="form-control" id="password" />
                                </div>

                            </div>

                            <div className="btn-box">
                                <button onClick={(event) => { login(event) }} className="btn ">Login</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </section>
    </>
}