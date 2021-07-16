import { Link } from "react-router-dom";

function UserItem(props) {
  return (
    <li
      key={props.user_id}
      className=" hover:border-green-700 border-green-400 p-1 m-3"
    >
      <div>
        <button className="flex-shrink-0 text-gray-400 border-b hover:text-green-700 border-green-400 hover:border-green-700 font-sans text-xl font-bold p-1">
         {props.name + " " + props.surname}
        </button>
      </div>
    </li>
  );
}

export default UserItem;
