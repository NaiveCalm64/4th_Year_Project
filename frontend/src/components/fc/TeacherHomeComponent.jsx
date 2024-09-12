import HeaderComponent from "./HeaderComponent"
import { useState } from "react"
import { retrieveAllSubjectsForStudentIdApi } from "./api/StudentApiService"
import { useEffect } from "react"
import { AuthContext, useAuth } from './security/AuthContext'
import { BrowserRouter, Routes, Route, useNavigate, useParams, Link } from 'react-router-dom'

export default function StudentHomeComponent() {

    const subjects = [
        {id:1, name:"Database Management Systems", department:"CSE" , semister:1},
        {id:2, name:"Computer Networks", department:"AI-ML" , semister:3},
        {id:3, name:"Operating Systems", department:"IT" , semister:7}     
    ]

    return(
        <div className="container">
            <HeaderComponent></HeaderComponent>
            <h3>Name: </h3>
            <div></div>
            <table className='table'>
                <thead>
                    <tr>
                        <td>Subject Id</td>
                        <td>Subject Name</td>
                        <td>Department</td>
                        <td>Semister</td>
                    </tr>
                </thead>
                <tbody>
                    {
                        subjects.map(
                            subject=>
                                <tr>
                                    <td>{subject.id}</td>
                                    <td>{subject.name}</td>
                                    <td>{subject.department}</td>
                                    <td>{subject.semister}</td>
                                    <td><button>Enter</button></td>
                                </tr>
                        )
                    }
                    
                </tbody>
            </table>
        </div>
    )
}