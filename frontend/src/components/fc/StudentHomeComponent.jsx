import HeaderComponent from "./HeaderComponent"
import AuthProvider, { AuthContext } from './security/AuthContext'
import { useAuth } from './security/AuthContext'
import { useState } from "react"
import {retrieveAllSubjectsForStudentIdApi} from "./api/StudentApiService"
import { useNavigate } from "react-router-dom"

export default function StudentHomeComponent() {

    const [subjects, setSubjects] = useState([])

    const authContext = useAuth()

    const navigate = useNavigate()

    const username = authContext.username

    // const subjects = [
    //     {id:1, name:"Database Management Systems", faculty: "JS"},
    //     {id:2, name:"Computer Networks", faculty: "ABj"},
    //     {id:3, name:"Operating Systems", faculty: "DC"}     
    // ]

    function refreshSubjects() {
        retrieveAllSubjectsForStudentIdApi(username)
            .then(response => {
                console.log(response)
                setSubjects(response.data)
            }
        )
        .catch(error => console.log(error))
    }
    
    return(
        <div className="container">
            <HeaderComponent></HeaderComponent>
            <h3>Name: {authContext.username}</h3>
            <h3>Department: </h3>
            <h3>Semister: </h3>
            <div></div>
            <table className='table'>
                <thead>
                    <tr>
                        <td>Subject Id</td>
                        <td>Subject Name</td>
                        <td>Faculty Name</td>
                    </tr>
                </thead>
                <tbody>
                    {
                        subjects.map(
                            subject=>
                                <tr>
                                    <td>{subject.id}</td>
                                    <td>{subject.name}</td>
                                    <td>{subject.faculty}</td>
                                    <td><button>Enter</button></td>
                                </tr>
                        )
                    }
                    
                </tbody>
            </table>
        </div>
    )
}