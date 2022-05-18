import * as React from 'react';
import ReactDOM from 'react-dom';
import CssBaseline from '@mui/material/CssBaseline';
import {ThemeProvider} from '@mui/material/styles';
import App from './home/app';
import theme from './theme';
import {BrowserRouter as Router, Route, Routes} from "react-router-dom";
import Form from "./form/form";
import Game from "./game/game";
import Result from "./result/result";

ReactDOM.render(        
    <Router>
        <ThemeProvider theme={theme}>
            <CssBaseline enableColorScheme/>
            <Routes>
                <Route path="/" element={<App/>}/>
                <Route path="/form" element={<Form/>}/>
                <Route path="/form/:formId" element={<Form/>}/>
                <Route path="/game/:formId" element={<Game/>}/>
                <Route path="/result/:formId" element={<Result/>}/>
            </Routes>
        </ThemeProvider>
    </Router>,
    document.querySelector('#root'),
);