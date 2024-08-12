import './HomeComponent.css'
import { BrowserRouter, Routes, Route, useNavigate, useParams, Link, Navigate } from 'react-router-dom'
import HomeComponent from './HomeComponent'
import StudentLoginComponent from './StudentLoginComponent'
import TeacherLoginComponent from './TeacherLoginComponent'
import AdminLoginComponent from './AdminLoginComponent'
import StudentHomeComponent from './StudentHomeComponent'
import TeacherHomeComponent from './TeacherHomeComponent'
import AdminHomeComponent from './AdminHomeComponent'

export default function FlippedClassroom() {

    return (

        <div className="flippedClassroom">
            <BrowserRouter>
                <Routes>
                    <Route path='/' element={<HomeComponent></HomeComponent>}></Route>
                    <Route path='/student-login' element={<StudentLoginComponent></StudentLoginComponent>}></Route>
                    <Route path='/teacher-login' element={<TeacherLoginComponent></TeacherLoginComponent>}></Route>
                    <Route path='/admin-login' element={<AdminLoginComponent></AdminLoginComponent>}></Route>
                    <Route path='/student' element={<StudentHomeComponent></StudentHomeComponent>}></Route>
                    <Route path='/teacher' element={<TeacherHomeComponent></TeacherHomeComponent>}></Route>
                    <Route path='/admin' element={<AdminHomeComponent></AdminHomeComponent>}></Route>
                </Routes>
            </BrowserRouter>
        </div>
    )
}

