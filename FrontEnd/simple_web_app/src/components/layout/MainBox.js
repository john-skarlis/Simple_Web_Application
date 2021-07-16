function MainBox(props) {
  return (
    <div className="px-4 py-16 mx-auto mt-20 sm:max-w-xl md:max-w-full lg:max-w-screen-xl md:px-24 lg:px-8 lg:py-20 bg-white">
      <div className="p-8 rounded shadow-2xl sm:p-16">
        <div className="block justify-items-stretch flex-col lg:flex-row">
            <div className="">
              <h2 className="border-b border-green-400 p-1 grid justify-items-center font-sans text-3xl font-bold tracking-tight text-gray-900 sm:text-4xl sm:leading-none">
                {props.title}
              </h2>
            </div>
            <div className="grid justify-items-center">{props.content}</div>
        </div>
      </div>
    </div>
  );
}

export default MainBox;
