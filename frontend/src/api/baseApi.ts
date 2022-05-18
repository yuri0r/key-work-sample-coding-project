import {ErrorData} from "../form/form";


class BaseApi {
    private readonly httpGetHeaders = {
        'Content-Type': 'application/json'
    };
    private readonly httpPostHeaders = {
        'Content-Type': 'application/json'
    };
    private readonly baseApiUrl = "http://localhost:8080/api";

    async getData(apiUri: string): Promise<unknown> {
        const url = `${this.baseApiUrl}/${apiUri}`;
        return fetch(url, {
            method: 'GET',
            headers: this.httpGetHeaders
        }).then(response => !response.ok
            ? Promise.reject(response)
            : response.json()
        ).catch(error => {
            error.json().then((data: ErrorData) => {
                console.error(data);
                alert(data.error + ": " + data.message);
            });
        });
    }

    async postData(apiUri: string, data: unknown): Promise<unknown> {
        const url = `${this.baseApiUrl}/${apiUri}`;
        return fetch(url, {
            method: 'POST',
            body: JSON.stringify(data),
            headers: this.httpPostHeaders
        }).then(response => !response.ok
            ? Promise.reject(response)
            : response.json()
        ).catch(error => {
            error.json().then((data: ErrorData) => {
                console.error(data);
                alert(data.error + ": " + data.message);
            });
            return Promise.reject(error);
        });
    }


}

export default new BaseApi();