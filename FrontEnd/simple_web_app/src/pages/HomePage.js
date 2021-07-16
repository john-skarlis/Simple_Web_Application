import HomeContent from "../components/HomeContent.js";
import MainBox from "../components/layout/MainBox.js";

function HomePage() {
  return <MainBox title="Home Page" content= {<HomeContent/>} />;
}

export default HomePage;
