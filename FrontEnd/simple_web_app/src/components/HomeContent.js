import {Link} from 'react-router-dom';



function HomeContent() {
    return (

        <div>
            <span >
                <p className="font-sans text-xl font-bold mb-3 mt-10">Click to see all users</p>
                <button className="flex-shrink-0 border-b text-green-400 border-green-400 hover:border-green-700 hover:text-green-700 mb-10"><Link to='/users'> Users</Link></button>
            </span>
            <span>
                <p className="font-sans text-xl font-bold mb-3">Click to add a new User</p>
                <button className="flex-shrink-0 border-b text-green-400 border-green-400 hover:border-green-700 hover:text-green-700"><Link to='/register'>Register</Link></button>
            </span>
        </div>

    );
}


export default HomeContent;