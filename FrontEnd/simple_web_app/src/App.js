import { Route } from "react-router-dom";
import HomePage from "./pages/HomePage";
import DisplayUsers from "./pages/DisplayUsers";
import RegisterNewUser from "./pages/RegisterNewUser";
import MainNavigation from "./components/layout/MainNavigation";
import {Switch} from "react-router-dom"

function App() {
  return (
    <div>
      <MainNavigation />
      <Switch>
        <Route path="/" exact={true}>
          <HomePage />
        </Route>
        <Route path="/users">
          <DisplayUsers />
        </Route>
        <Route path="/register">
          <RegisterNewUser />
        </Route>
      </Switch>
    </div>
  );
}

export default App;
