export default function RegistrationForm({idRef, nameRef, courseRef, branchRef, branchList, addStudent, setBranch}) {

    return <>
        <div className="form container p-3">
            <div className="row">
                <div className="col-md-6">
                    <div className="form-group">
                        <label htmlFor="" className="form-label">Student Id</label>
                        <input ref={idRef} id='studentId' type="text" className="form-control" />
                    </div>
                    <div className="form-group">
                        <label htmlFor="" className="form-label">Student name</label>
                        <input ref={nameRef} id='studentName' type="text" className="form-control" />
                    </div>
                </div>
                <div className="col-md-6">
                    <div className="form-group">
                        <label htmlFor="" className="form-label">Student Course</label>
                        <input ref={courseRef} id='studentCourse' type="text" className="form-control" />
                    </div>
                    <div className="form-group">
                        <label htmlFor="" className="form-label">Student Branch</label>
                        {/* <input id='studentBranch' type="text" className="form-control" /> */}
                        <select ref={branchRef} id='studentBranch' className='form-control' name="" >
                            <option>Select</option>
                            {branchList.map((branch, index) => <option value={branch} key={index} >{branch}</option>)}
                        </select>
                    </div>
                </div>
            </div>
            <button onClick={addStudent} className='btn btn-primary mt-2'>Add</button>
            <button value={"All"} onClick={(e) => setBranch(e.target.value)} className="btn btn-danger mt-2 ms-2">All</button>
            <button value={"CS"} onClick={(e) => setBranch(e.target.value)} className="btn btn-info mt-2 ms-2">CS</button>
            <button value={"CSE"} onClick={(e) => setBranch(e.target.value)} className="btn btn-warning mt-2 ms-2">CSE</button>
            <button value={"CIVIL"} onClick={(e) => setBranch(e.target.value)} className="btn btn-dark mt-2 ms-2">Civil</button>
            <button value={"EC"} onClick={(e) => setBranch(e.target.value)} className="btn btn-secondary mt-2 ms-2">EC</button>

        </div>
    </>
}