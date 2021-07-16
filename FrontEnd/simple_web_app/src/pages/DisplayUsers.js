import MainBox from "../components/layout/MainBox.js";
import UserList from "../components/user/UserList";

const UsersData = [
  {
    name: "nikos",
    surname: "evagelou",
    gender: "Male",
    date: "2001-05-13",
    home_address: "xlkidiki",
    work_address: "thessaloniki",
    user_id: 1,
    address_id: 1,
  },
  {
    name: "Giannis",
    surname: "Skarlis",
    gender: "Male",
    date: "1997-11-27",
    home_address: "vasilika",
    work_address: "thessaloniki",
    user_id: 2,
    address_id: 2,
  },
  {
    name: "Giorgos",
    surname: "Papadopoulos",
    gender: "Male",
    date: "1980-08-29",
    home_address: "thessaloniki",
    work_address: "thessaloniki",
    user_id: 3,
    address_id: 3,
  },
];

function DisplayUsers() {
  return (
    <MainBox title='All Users' content={<UserList users={UsersData}/>} />
    // <section>
    //   <h1> All Users </h1>
    //   <UserList users={UsersData}/>
    // </section>
  );
}

export default DisplayUsers;
