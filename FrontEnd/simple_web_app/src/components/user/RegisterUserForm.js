import { useState } from "react";
import DatePicker from "react-datepicker";
import "react-datepicker/dist/react-datepicker.css";
import { Link } from "react-router-dom";

function RegisterUserForm() {
  const options = [
    { value: "Male", label: "Male" },
    { value: "Female", label: "Female" },
  ];

  const [startDate, setStartDate] = useState(new Date());
  function SubmitAction() {
    
  }

  return (
    <form className="w-full max-w-sm" onSubmit={SubmitAction}>
      <div className="block sm:block items-center py-2 mt-5">
        <input
          className="flex items-center border-b border-green-400 appearance-none bg-transparent w-full text-gray-700 mr-3 py-1 px-2 mb-10 leading-tight focus:outline-none"
          type="text"
          placeholder="Name"
          required
        />
        <input
          className="flex items-center border-b border-green-400 appearance-none bg-transparent w-full text-gray-700 mr-3 py-1 px-2 mb-10 leading-tight focus:outline-none"
          type="text"
          placeholder="Surname"
          required
        />
        <select className="form-select border-b border-green-400 p-1 block w-full mb-10" required>
          {options.map((option) => (
            <option value={option.value}>{option.label}</option>
          ))}
        </select>
        <div>
          <p className=" text-gray-400 inline-block border-b p-1 border-green-400 mr-3">
            Birth Date:
          </p>
          <DatePicker
            className="inline-block border-b mb-10 border-green-400 p-1"
            selected={startDate}
            onChange={(date) => setStartDate(date)
            }
          />
        </div>
        <input
          className="flex items-center border-b border-green-400 appearance-none bg-transparent w-full text-gray-700 mr-3 py-1 px-2 mb-10 leading-tight focus:outline-none"
          type="text"
          placeholder="Work address"
        />
        <input
          className="flex items-center border-b border-green-400 appearance-none bg-transparent w-full text-gray-700 mr-3 py-1 px-2 mb-10 leading-tight focus:outline-none"
          type="text"
          placeholder="Home address"
        />
        <button
          className="flex-shrink-0  border-b border-t border-r border-l rounded text-green-400 hover:text-green-700 border-green-400 hover:border-green-700 text-sm  text-white py-1 px-2 "
          type="submit"
        >
          Sign Up
        </button>
        <button
          className="flex-shrink-0 border-b text-green-400 border-green-400 hover:border-green-700 hover:text-green-700 text-sm py-1 px-2 ml-4"
          type="button"
        >
          <Link to="/"> Cancel</Link>
        </button>
      </div>
    </form>
  );
}

export default RegisterUserForm;
