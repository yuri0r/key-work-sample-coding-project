import React from 'react';
import {render} from '@testing-library/react';
import App from './app';
import {MemoryRouter} from "react-router-dom";

test('renders without crashing', () => {
    render(
        <MemoryRouter>
            <App/>
        </MemoryRouter>
    );
});
