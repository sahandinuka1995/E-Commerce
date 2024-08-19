import axios from "axios"
import { useEffect, useState } from "react"

const User = () => {
    const [data, setData] = useState([])

    useEffect(() => {
        getUsers()
    }, [])

    const getUsers = async () => {
        await axios.get('http://localhost:8080/api/v1/user').then(res => {
            setData(res.data.data)
        }).catch(error => {
            console.log(error);

        })
    }

    return <div>
        <h1>User Page</h1>

        <div>
            <table border="1">
                <tr>
                    <th>Name</th>
                    <th>Address</th>
                    <th>Tel</th>
                    <th>Password</th>
                </tr>
                {
                    data.map((item, index) => <tr key={index}>
                        <td>{item.name}</td>
                        <td>{item.address}</td>
                        <td>{item.tel}</td>
                        <td>{item.password}</td>
                    </tr>)
                }
            </table>
        </div>
    </div>
}

export default User