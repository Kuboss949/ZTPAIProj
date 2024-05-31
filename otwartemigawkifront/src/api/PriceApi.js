import axios from 'axios';

export const fetchSessionTypes = async () => {
    try {
        const response = await axios.get('/api/session/all-enabled');
        return response.data;
    } catch (error) {
        throw new Error('Error fetching data:', error);
    }
};