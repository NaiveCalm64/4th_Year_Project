import './HomeComponent.css'
import { BrowserRouter, Routes, Route, useNavigate, useParams, Link, Navigate } from 'react-router-dom'
import HomeComponent from './HomeComponent'
import StudentLoginComponent from './StudentLoginComponent'
import TeacherLoginComponent from './TeacherLoginComponent'
import AdminLoginComponent from './AdminLoginComponent'
import StudentHomeComponent from './StudentHomeComponent'
import TeacherHomeComponent from './TeacherHomeComponent'
import AdminHomeComponent from './AdminHomeComponent'
import AuthProvider from './security/AuthContext'
import { useAuth } from './security/AuthContext'
import LogoutComponent from './LogutComponent'

export default function FlippedClassroom() {

    function AuthenticatedRoute({children}) {
        const authContext = useAuth()
        if(authContext.isAuthenticated)
            return children

        return <Navigate to="/"></Navigate>
    }

    return (

        <div className="flippedClassroom">
            <AuthProvider>
                <BrowserRouter>
                    <Routes>
                        <Route path='/' element={<HomeComponent></HomeComponent>}></Route>
                        <Route path='/student-login' element={<StudentLoginComponent></StudentLoginComponent>}></Route>
                        <Route path='/teacher-login' element={<TeacherLoginComponent></TeacherLoginComponent>}></Route>
                        <Route path='/admin-login' element={<AdminLoginComponent></AdminLoginComponent>}></Route>
                        <Route path='/student/:username' element={<AuthenticatedRoute><StudentHomeComponent></StudentHomeComponent></AuthenticatedRoute>}></Route>
                        <Route path='/teacher/:username' element={<AuthenticatedRoute><TeacherHomeComponent></TeacherHomeComponent></AuthenticatedRoute>}></Route>
                        <Route path='/admin' element={<AuthenticatedRoute><AdminHomeComponent></AdminHomeComponent></AuthenticatedRoute>}></Route>
                        <Route path='/logout' element={
                            <AuthenticatedRoute>
                                <LogoutComponent></LogoutComponent>
                            </AuthenticatedRoute>
                        }></Route>
                    </Routes>
                </BrowserRouter>
            </AuthProvider>
        </div>
    )
}

