// function RegisterNewUser() {
//     return <div>Register New User Page</div>
// }

import MainBox from "../components/layout/MainBox.js";
import RegisterUserForm from "../components/user/RegisterUserForm.js";

function RegisterNewUser (){
    return (
      <MainBox title='Register' content={<RegisterUserForm />}/>
    );
  };

export default RegisterNewUser; 