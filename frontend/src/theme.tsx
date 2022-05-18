import {red} from '@mui/material/colors';
import {createTheme} from '@mui/material/styles';

const darkMode = window.matchMedia && window.matchMedia('(prefers-color-scheme: dark)').matches;

// A custom theme for this app
const theme = createTheme({
    palette: {
        mode: darkMode ? "dark" : "light",
        primary: {
            main: '#556cd6',
        },
        secondary: {
            main: '#19857b',
        },
        error: {
            main: red.A400,
        },
    },
});

export default theme;