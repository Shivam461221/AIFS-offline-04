export default function List({filteredStudents, removeStudents}){

    return <>
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
}