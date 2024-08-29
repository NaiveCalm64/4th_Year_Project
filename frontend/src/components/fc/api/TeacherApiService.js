import {apiClient} from './ApiClient'

// export const retrieveHelloWorldBean = () => apiClient.get("hello-world-bean")

// export const retrieveHelloWorldPathVariable = (username, token) => apiClient.get(`hello-world/path-variable/${username}`,{
//     headers: {
//         Authorization: token
//     }
// })


export const retrieveAllSubjectsForTeacherIdApi = (username) => apiClient.get(`/teachers/${username}/subjects`)