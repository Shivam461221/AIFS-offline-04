import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import StudentData from './StudentData'

function App() {
  const [studentList, setStudentsList] = useState(StudentData);

  const [branch, setBranch] = useState('All');

  const [branchList, setBranchList] = useState(["CS","CSE","EC", "CIVIL"]);

  const addStudent=()=>{
    let studentId = document.getElementById('studentId').value;
    let studentName = document.getElementById('studentName').value;
    let studentCourse = document.getElementById('studentCourse').value;
    let studentBranch = document.getElementById('studentBranch').value;

    if(studentId && studentName && studentBranch && studentCourse){

      const newStudent = {studentId, studentName, studentCourse, studentBranch};
      setStudentsList([...studentList, newStudent]);

    }
    else{
      alert('Insert details first');
    }
  }

  const removeStudents=(studentId)=>{
    
    let index = studentList.findIndex(student=>student.studentId===studentId);

    studentList.splice(index, 1);

    setStudentsList([...studentList]);
  }

  console.log(branch);

  const filteredStudents = (branch==='All') ? studentList : studentList.filter(student=>student.studentBranch===branch)

  return (
    <>
      <div className="container-fluid bg-danger text-white text-center p-2 display-6">
        Student App
      </div>
      <div className="form container">
        <div className="row">
          <div className="col-md-6">
            <div className="form-group">
              <label htmlFor="" className="form-label">Student Id</label>
              <input id='studentId' type="text" className="form-control" />
            </div>
            <div className="form-group">
              <label htmlFor="" className="form-label">Student name</label>
              <input id='studentName' type="text" className="form-control" />
            </div>
          </div>
          <div className="col-md-6">
            <div className="form-group">
              <label htmlFor="" className="form-label">Student Course</label>
              <input id='studentCourse' type="text" className="form-control" />
            </div>
            <div className="form-group">
              <label htmlFor="" className="form-label">Student Branch</label>
              {/* <input id='studentBranch' type="text" className="form-control" /> */}
              <select id='studentBranch' className='form-control' name="" >
                <option>Select</option>
                  {branchList.map((branch, index)=><option value={branch} key={index} >{branch}</option>)}
              </select>
            </div>
          </div>  
        </div>
        <button  onClick={addStudent} className='btn btn-primary mt-2'>Add</button>
        <button value={"All"} onClick={(e)=>setBranch(e.target.value)} className="btn btn-danger mt-2 ms-2">All</button>
        <button value={"CS"} onClick={(e)=>setBranch(e.target.value)} className="btn btn-info mt-2 ms-2">CS</button>
        <button value={"CSE"} onClick={(e)=>setBranch(e.target.value)} className="btn btn-warning mt-2 ms-2">CSE</button>
        <button value={"CIVIL"} onClick={(e)=>setBranch(e.target.value)} className="btn btn-dark mt-2 ms-2">Civil</button>
        <button value={"EC"} onClick={(e)=>setBranch(e.target.value)} className="btn btn-secondary mt-2 ms-2">EC</button>
        
      </div>
      <table className="table mt-2">
        <thead>
          <tr className='table-danger'>
            <th>S.no</th>
            <th>ID</th>
            <th>Student Name</th>
            <th>Student Course</th>
            <th>Student Branch</th>
            <th>Actions</th>
          </tr>
        </thead>
        <tbody>
          {
            filteredStudents.map((student, index)=><tr key={index} >
              <td>{index+1}</td>
              <td>{student.studentId}</td>
              <td>{student.studentName}</td>
              <td>{student.studentCourse}</td>
              <td>{student.studentBranch}</td>
              <td><button onClick={()=>removeStudents(student.studentId)} className='btn btn-danger'>Remove</button></td>
            </tr>)
          }
        </tbody>
      </table>
    </>
  )
}

export default App
