import { useRef, useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import StudentData from './StudentData'
import Header from './components/Header'
import RegistrationForm from './components/RegistrationForm'
import List from './components/List'

function App() {
  const [studentList, setStudentsList] = useState(StudentData);

  const [branch, setBranch] = useState('All');

  const idRef = useRef();
  const nameRef = useRef();
  const courseRef = useRef();
  const branchRef = useRef();

  //const x = useRef(0);

  //console.log(x.current);

  const [branchList, setBranchList] = useState(["CS","CSE","EC", "CIVIL"]);

  // const addStudent=()=>{
  //   let studentId = document.getElementById('studentId').value;
  //   let studentName = document.getElementById('studentName').value;
  //   let studentCourse = document.getElementById('studentCourse').value;
  //   let studentBranch = document.getElementById('studentBranch').value;

  //   if(studentId && studentName && studentBranch && studentCourse){

  //     const newStudent = {studentId, studentName, studentCourse, studentBranch};
  //     setStudentsList([...studentList, newStudent]);

  //   }
  //   else{
  //     alert('Insert details first');
  //   }
  // }

  const addStudent=()=>{
    let studentId = idRef.current.value;
    let studentName = nameRef.current.value;
    let studentCourse = courseRef.current.value;
    let studentBranch = branchRef.current.value;

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
      <Header/>
      <RegistrationForm idRef={idRef} nameRef={nameRef} courseRef={courseRef} branchRef={branchRef} branchList={branchList} addStudent={addStudent} setBranch={setBranch} />
      <List filteredStudents={filteredStudents} removeStudents={removeStudents} />
    </>
  )
}

export default App
