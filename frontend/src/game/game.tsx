import Container from '@mui/material/Container';
import Box from "@mui/material/Box";
import Link from "@mui/material/Link";
import {Link as RouterLink, useParams} from "react-router-dom";
import Typography from "@mui/material/Typography";
import {useState} from "react";


function Game() {
    const {formId} = useParams();
    const [allowedToContinue, setAllowedToContinue] = useState(false);

    return (
        <Container maxWidth="sm">
            <Box sx={{my: 4}}>
                <Typography variant="h4"
                            component="h1"
                            gutterBottom
                            sx={{cursor: "pointer"}}
                            onClick={() => setAllowedToContinue(true)}
                >
                    Game
                </Typography>
            </Box>
            {
                allowedToContinue &&
                <Box sx={{float: "right"}}>
                    <Link component={RouterLink} to={`/result/${formId}`}>
                        Continue
                    </Link>
                </Box>
            }
        </Container>
    );
}

export default Game;