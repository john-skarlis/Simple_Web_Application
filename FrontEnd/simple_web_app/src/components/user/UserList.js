import { Link } from "react-router-dom";
import UserItem from "./UserItem";

function UserList(props) {
  return (
    <div>
    <ul className="mt-7">
      {props.users.map((user) => (
        <UserItem key={user.id} name={user.name} surname={user.surname} />
      ))}
    </ul>
    <button className="flex-shrink-0 border-b text-green-400 border-green-400 hover:border-green-700 hover:text-green-700 text-sm py-1 px-2 ml-4"><Link to="/" >Back</Link></button>
    </div>
  );
}

export default UserList;