export default function StudentHomeComponent() {

    const subjects = [
        {id:1, name:"Database Management Systems", faculty: "JS"},
        {id:2, name:"Computer Networks", faculty: "ABj"},
        {id:3, name:"Operating Systems", faculty: "DC"}     
    ]

    return(
        <div className="container">
            <h3>Name: </h3>
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