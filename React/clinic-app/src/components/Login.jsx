export default function Login(){
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
                                    <input type="text" className="form-control" id="username" placeholder="" />
                                </div>
                                <div className="form-group col-lg-6">
                                    <label for="Password">Password</label>
                                    <input type="password" className="form-control" id="password"  />
                                </div>
                                
                            </div>
                           
                            <div className="btn-box">
                                <button type="submit" className="btn ">Login</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </section>
    </>
}